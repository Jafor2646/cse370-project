import {Link, useLocation, useNavigate} from "react-router-dom";
import {useContext, useEffect, useState} from "react";
import {Auth} from "../../Auth/Auth";
import Author from "../../Model/Author";
import "./../Homepage/Homepage.css";
import Subpage from "../Utility/Subpage";
import AuthorController from "../../Controller/AuthorController";
import AuthorPicture from "../../Model/AuthorPicture";
import {LazyLoadImage} from "react-lazy-load-image-component";

function AuthorViewer() {
    const location = useLocation();
    const searchParams = new URLSearchParams(location.search);
    const jsonString = searchParams.get("data") || "";
    const [selectedAuthor, setSelectedAuthor] = useState<Author>();
    const [authorPicture, setAuthorPicture] = useState<AuthorPicture>()

    const {authorised, userId, userType} = useContext(Auth);
    let navigate = useNavigate();

    useEffect(() => {
        if (jsonString === "") {
            navigate("/home");
            return;
        }
        const data = JSON.parse(decodeURIComponent(jsonString));
        const selectedAuthorTemp: Author = data.author;
        setSelectedAuthor(selectedAuthorTemp);
    }, []);

    useEffect(() => {
        if(selectedAuthor){
            AuthorController.findAuthorPictureByAuthor(selectedAuthor).then((res) => {
                setAuthorPicture(res.data)
            })
        }
    }, [selectedAuthor]);

    return (
        <div className="background_image_home" style={authorPicture ? { backgroundImage: `url(${authorPicture.apPicture})` } : { backgroundImage: `url("./../../Assets/Images/Backgrounds/home-page-bg.jpg")` }}>
            <div className="bg-black bg-opacity-90 min-h-screen">
                <div className="flex ">
                    <LazyLoadImage
                        className={`m-2 rounded-lg object-fill w-64 h-96 `}
                        src={authorPicture?.apPicture}
                        alt={authorPicture?.author.aname}
                        width={256}
                        height={384}
                        placeholderSrc={require("./../../Assets/Images/Placeholders/manga-placeholder.png")}
                    />
                    {selectedAuthor && (
                        <div className="m-2 ms-4 text-white">
                            <div className="font-bold text-6xl">
                                {selectedAuthor.aname}
                            </div>
                            <div className="text-sm max-w-7xl mt-5">
                                {selectedAuthor.adescription}
                            </div>
                            <div>
                                <a
                                    href={selectedAuthor.awebsite}
                                    target="_blank"
                                    rel="noopener noreferrer"
                                    className="text-blue-500 mt-2 hover:underline"
                                >
                                    Visit Website
                                </a>
                            </div>
                        </div>
                    )}
                </div>
                {selectedAuthor && (
                    <div>
                        <div className=" text-white text-center font-bold text-4xl p-4">
                            {selectedAuthor.aname} Manga
                        </div>
                        <div>
                            <div>
                                <Subpage fetchMangaData={AuthorController.getAllAuthorManga} fetchMangaPageNumber={AuthorController.getAuthorMangaCount} element={selectedAuthor}/>
                            </div>

                        </div>
                    </div>
                )}
            </div>
        </div>
    );
}

export default AuthorViewer;
