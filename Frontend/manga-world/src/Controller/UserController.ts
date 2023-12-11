import axios from "axios";

const USER_API_BASE_URL = "http://localhost:8080/";

class UserController {
    getUserById(userId: string) {
        return axios.get(USER_API_BASE_URL + "users/getUserById/" + userId);
    }
}

export default new UserController();