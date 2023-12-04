import Manga from "./Manga";
import User from "./User";

class AlreadyRead {
    userid: number;
    mid: number;
    addeddate: Date;
    user: User;
    manga: Manga;

    constructor(userid: number, mid: number, addeddate: Date, user: User, manga: Manga) {
        this.userid = userid;
        this.mid = mid;
        this.addeddate = addeddate;
        this.user = user;
        this.manga = manga;
    }
}

export default AlreadyRead;