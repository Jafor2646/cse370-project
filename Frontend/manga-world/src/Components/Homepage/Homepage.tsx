import "./Homepage.css";
import {useContext, useEffect, useState} from "react";
import {Auth} from "../../Auth/Auth";
import {useNavigate} from "react-router-dom";
import Category from "../../Model/Category";
import CategoryController from "../../Controller/CategoryController";

function Homepage() {
    const [catagories, setCatagories] = useState<Category[]>([]);

    const {authorised, userId, userType} = useContext(Auth);
    let navigate = useNavigate();

    useEffect(() => {
        CategoryController.allCategories().then((res) => {
            setCatagories(res.data);
        });
    }, []);

    return (
        <div className="background_image_home">
            <div className="flex gap-x-2">
                <div className="flex-col bg-black bg-opacity-75">
                    {catagories.map((category) => (
                            <div key={category.cid}
                                 className="text-white mt-1 p-2 font-bold bg-black bg-opacity-10 hover:bg-opacity-75 hover:rounded hover:cursor-pointer hover:m-1"
                                 onClick={(e) => {
                                     navigate(`/category/${category.cname}`)
                                 }}
                            >
                                {category.cname}
                            </div>
                        )
                    )}
                </div>
                <div className="flex-grow bg-black">
                    Catagories
                </div>

            </div>
        </div>
    );
}

export default Homepage;
