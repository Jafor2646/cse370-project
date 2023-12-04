import axios from "axios";

const USER_API_BASE_URL = "http://localhost:8080/";

class CategoryController {

    allCategories() {
        return axios.get(USER_API_BASE_URL + "allCategories");
    }

}

export default new CategoryController();
