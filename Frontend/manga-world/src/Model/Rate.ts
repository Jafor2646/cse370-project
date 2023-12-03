import Manga from "./Manga";
import User from "./User";

class Rate {
    rId: number;
    rValue: number;
    rDate: Date;
    rComment: string;
    userId: number;
    mId: number;
    user: User;
    manga: Manga;
    
    constructor(rId: number, rValue: number, rDate: Date, rComment: string, userId: number, mId: number, user: User, manga: Manga) {
        this.rId = rId;
        this.rValue = rValue;
        this.rDate = rDate;
        this.rComment = rComment;
        this.userId = userId;
        this.mId = mId;
        this.user = user;
        this.manga = manga;
    }
}

export default Rate;