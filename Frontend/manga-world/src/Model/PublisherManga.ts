import Manga from "./Manga";
import Publisher from "./Publisher";

class publisherManga {
    pId: number;
    mId: number;
    publisher: Publisher;
    manga: Manga;

    constructor(pId: number, mId: number, publisher: Publisher, manga: Manga) {
        this.pId = pId;
        this.mId = mId;
        this.publisher = publisher;
        this.manga = manga;
    }
}

export default publisherManga;