import axios from "axios";

const USER_API_BASE_URL = "http://localhost:8080/";

class AuthorMangaController {

    getAuthorMangaByManga(manga: any) {
        return axios.post(USER_API_BASE_URL + "authorMangas/getAuthorMangaByManga", manga);
    }

}

export default new AuthorMangaController();
