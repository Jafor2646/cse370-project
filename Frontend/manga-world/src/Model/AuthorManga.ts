import author from "./Author";
import manga from "./Manga";

class authorManga {
    aid: number;
    mid: number;
    author: author;
    manga: manga;

    constructor(aid: number, mid: number, author: author, manga: manga) {
        this.aid = aid;
        this.mid = mid;
        this.author = author;
        this.manga = manga;
    }
}

export default authorManga;