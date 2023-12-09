import "./../Homepage/Homepage.css";
import {useContext, useEffect, useState} from "react";
import {Auth} from "../../Auth/Auth";
import {Link, useLocation, useNavigate} from "react-router-dom";
import Manga from "../../Model/Manga";
import MangaPicture from "../../Model/MangaPicture";
import MangaPictureController from "../../Controller/MangaPictureController";
import {LazyLoadImage} from "react-lazy-load-image-component";
import AuthorManga from "../../Model/AuthorManga";
import AuthorMangaController from "../../Controller/AuthorMangaController";
import PublisherMangaController from "../../Controller/PublisherMangaController";
import PublisherManga from "../../Model/PublisherManga";
import Volume from "../../Model/Volume";
import VolumeController from "../../Controller/VolumeController";
import VolumeCard from "./VolumeCard/VolumeCard";
import manga from "../../Model/Manga";

function MangaViewer() {
    const location = useLocation();
    const searchParams = new URLSearchParams(location.search);
    const jsonString = searchParams.get("data") || "";
    const [selectedManga, setSelectedManga] = useState<Manga>();
    const [selectedMangaPicture, setSelectedMangaPicture] = useState<MangaPicture>();
    const [authorManga, setAuthorManga] = useState<AuthorManga[]>([]);
    const [publisherManga, setPublisherManga] = useState<PublisherManga>();
    const [volumes, setVolumes] = useState<Volume[]>([]);

    const {authorised, userId, userType} = useContext(Auth);
    let navigate = useNavigate();

    useEffect(() => {
        if (jsonString === "") {
            navigate("/home");
            return;
        }
        const data = JSON.parse(decodeURIComponent(jsonString));
        const selectedMangaTemp: Manga = data.manga;
        setSelectedManga(selectedMangaTemp);
    }, []);

    useEffect(() => {
        if(selectedManga){
            MangaPictureController.getByManga(selectedManga).then((mangaPicture) => {
                setSelectedMangaPicture(mangaPicture.data);
            });
            AuthorMangaController.getAuthorMangaByManga(selectedManga).then((res) => {
                setAuthorManga(res.data);
            });
            PublisherMangaController.getPublisherMangaByManga(selectedManga).then((res) => {
                setPublisherManga(res.data);
            });
            VolumeController.findAllByManga(selectedManga).then((res) => {
                setVolumes(res.data);
            });
        }
    }, [selectedManga]);

    return (
        <div className="background_image_home " style={selectedMangaPicture ? { backgroundImage: `url(${selectedMangaPicture?.mpPicture})` } : { backgroundImage: `url("./../../Assets/Images/Backgrounds/home-page-bg.jpg")` }}>
            <div className="bg-black bg-opacity-90 min-h-screen">
                <div className="flex ">

                        <LazyLoadImage
                            className={`m-2 rounded-lg object-fill w-64 h-96 `}
                            src={selectedMangaPicture?.mpPicture}
                            alt={selectedManga?.mtitle}
                            width={256}
                            height={384}
                            placeholderSrc={require("./../../Assets/Images/Placeholders/manga-placeholder.png")}
                        />

                    {selectedManga && (
                        <div className="m-2 ms-4 text-white">
                            <div className="font-bold text-6xl">
                                {selectedManga.mtitle}
                            </div>
                            <div className="text-sm max-w-7xl mt-5">
                                {selectedManga.mdescription}
                            </div>
                            <div className="text-white mt-2">
                                Publish Date: {selectedManga.mpublishDate.toString()}
                            </div>
                            <div className="font-normal">
                                Status: {selectedManga.mstatus === "ongoing" ? <span className="text-gray-400">On going</span> : <span className="text-green-700">Complete</span>}
                            </div>
                            <div className="text-sm font-normal mt-2">
                                Mangaka: {authorManga.map((author) => (
                                <Link
                                    key={author.aid}
                                    to={{
                                        pathname: "/author",
                                        search: `?data=${encodeURIComponent(
                                            JSON.stringify({
                                                author: author.author
                                            })
                                        )}`}}
                                    className="hover:text-blue-400 hover:underline text-lg bg-gray-800 hover:bg-gray-900 ms-2 rounded p-1"
                                >
                                    {author.author.aname}
                                </Link>
                            ))}
                            </div>
                            <div className="text-sm font-normal mt-3">
                                Publisher:
                                <Link
                                    to={{
                                        pathname: "/publisher",
                                        search: `?data=${encodeURIComponent(
                                            JSON.stringify({
                                                publisher: publisherManga?.publisher
                                            })
                                        )}`}}
                                    className="hover:text-blue-400 hover:underline text-lg bg-gray-800 hover:bg-gray-900 ms-2 rounded p-1"
                                >
                                    {publisherManga?.publisher.pname}
                                </Link>
                            </div>
                        </div>
                    )}
                </div>
                <div className="m-4 mb-0">
                    <div className=" p-4 rounded font-extrabold text-center text-2xl text-white">
                        Volumes
                    </div>
                    <div>
                        {volumes.map((volume) => (
                            <Link
                                key={volume.vid}
                                to={{
                                    pathname: "/chapter",
                                    search: `?data=${encodeURIComponent(
                                        JSON.stringify({
                                            volume:volume,
                                            volumes: volumes,
                                        })
                                    )}`}}
                            >
                                <VolumeCard {...volume} />
                            </Link>
                        ))}
                    </div>
                </div>
            </div>
        </div>
    );
}

export default MangaViewer;
