import "./../Homepage/Homepage.css";
import {useContext, useEffect, useState} from "react";
import {Auth} from "../../Auth/Auth";
import {useLocation, useNavigate} from "react-router-dom";
import Category from "../../Model/Category";

function CategoryViewer() {
    const location = useLocation();
    const searchParams = new URLSearchParams(location.search);
    const jsonString = searchParams.get("data") || "";
    const {authorised, userId, userType} = useContext(Auth);
    let navigate = useNavigate();
    const [selectedCategory, setSelectedCategory] = useState<Category>();

    useEffect(() => {
        if (jsonString === "") {
            navigate("/home");
            return;
        }
        const data = JSON.parse(decodeURIComponent(jsonString));
        const selectedCategoryTemp: Category = data.category;
        setSelectedCategory(selectedCategoryTemp);
    }, [jsonString]);

    return (
        <div className="background_image_home">

        </div>
    );
}

export default CategoryViewer;
