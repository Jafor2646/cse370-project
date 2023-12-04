import Category from "./Category";
import Manga from "./Manga";

class CategoryManga {
    cid: number;
    mid: number;
    category: Category;
    manga: Manga;

    constructor(cid: number, mid: number, category: Category, manga: Manga) {
        this.cid = cid;
        this.mid = mid;
        this.category = category;
        this.manga = manga;
    }
}

export default CategoryManga;