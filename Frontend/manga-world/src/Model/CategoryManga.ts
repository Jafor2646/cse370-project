import category from "./category";
import manga from "./Manga";

class categoryManga {
    cid: number;
    mid: number;
    category: category;
    manga: manga;

    constructor(cid: number, mid: number, category: category, manga: manga) {
        this.cid = cid;
        this.mid = mid;
        this.category = category;
        this.manga = manga;
    }
}

export default categoryManga;