import Category from "./Category";
import Manga from "./Manga";

class CategoryManga {
    cId: number;
    mId: number;
    category: Category;
    manga: Manga;

    constructor(cId: number, mId: number, category: Category, manga: Manga) {
        this.cId = cId;
        this.mId = mId;
        this.category = category;
        this.manga = manga;
    }
}

export default CategoryManga;