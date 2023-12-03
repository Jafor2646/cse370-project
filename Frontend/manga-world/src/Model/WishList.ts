import Manga from "./Manga";
import User from "./User";

class WishList {
    userId: number;
    mId: number;
    addedDate: Date;
    user: User;
    manga: Manga;

    constructor(userId: number, mId: number, addedDate: Date, user: User, manga: Manga) { 
        this.userId = userId;
        this.mId = mId;
        this.addedDate = addedDate;
        this.user = user;
        this.manga = manga;
    }
}

export default WishList; 