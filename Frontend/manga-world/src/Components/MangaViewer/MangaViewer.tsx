import "./../Homepage/Homepage.css";
import {useContext, useEffect, useState} from "react";
import {Auth} from "../../Auth/Auth";
import {Link, useLocation, useNavigate} from "react-router-dom";
import Manga from "../../Model/Manga";

function Homepage() {
    const location = useLocation();
    const searchParams = new URLSearchParams(location.search);
    const jsonString = searchParams.get("data") || "";
    const [selectedManga, setSelectedManga] = useState<Manga>();

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

    return (
        <div className="background_image_home">

        </div>
    );
}

export default Homepage;
