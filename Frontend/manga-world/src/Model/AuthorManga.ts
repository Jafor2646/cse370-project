import Author from "./Author";
import Manga from "./Manga";

class AuthorManga {
    aId: number;
    mId: number;
    author: Author;
    manga: Manga;

    constructor(aId: number, mId: number, author: Author, manga: Manga) {
        this.aId = aId;
        this.mId = mId;
        this.author = author;
        this.manga = manga;
    }
}

export default AuthorManga;