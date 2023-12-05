import axios from "axios";

const USER_API_BASE_URL = "http://localhost:8080/";

class MangaController {

    getAllMangaNames() {
        return axios.get(USER_API_BASE_URL + "mangas/getAllMangaNames");
    }
    getMostViewedManga(){
        return axios.get(USER_API_BASE_URL + "mangas/getMostViewedManga");
    }

    getMostRatedManga(){
        return axios.get(USER_API_BASE_URL + "mangas/getMostRatedManga");
    }

    getNewManga(){
        return axios.get(USER_API_BASE_URL + "mangas/getNewManga");
    }

    getMostReadMangas(){
        return axios.get(USER_API_BASE_URL + "mangas/getMostReadMangas");
    }
    getTodayPickMangas(){
        return axios.get(USER_API_BASE_URL + "mangas/getTodayPickMangas");
    }

}

export default new MangaController();