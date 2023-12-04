import manga from "./Manga";
import user from "./user";

class alreadyRead {
    userid: number;
    mid: number;
    addeddate: Date;
    user: user;
    manga: manga;

    constructor(userid: number, mid: number, addeddate: Date, user: user, manga: manga) {
        this.userid = userid;
        this.mid = mid;
        this.addeddate = addeddate;
        this.user = user;
        this.manga = manga;
    }
}

export default alreadyRead;