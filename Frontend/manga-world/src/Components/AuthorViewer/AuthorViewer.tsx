import {useLocation, useNavigate} from "react-router-dom";
import {useContext, useEffect, useState} from "react";
import {Auth} from "../../Auth/Auth";
import Author from "../../Model/Author";
import "./../Homepage/Homepage.css";

function AuthorViewer() {
    const location = useLocation();
    const searchParams = new URLSearchParams(location.search);
    const jsonString = searchParams.get("data") || "";
    const [selectedAuthor, setSelectedAuthor] = useState<Author>();

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

    return (
        <div className="background_image_home">

        </div>
    );
}

export default AuthorViewer;
