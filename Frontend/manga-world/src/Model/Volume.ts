import Manga from "./Manga";

class volume {
    vId: number;
    vNumber: number;
    vTitle: string;
    vReleaseDate: Date;
    vViews: number;
    manga: Manga;

    constructor(vId: number, vNumber: number, vTitle: string, vReleaseDate: Date, vViews: number, manga: Manga) {
        this.vId = vId;
        this.vNumber = vNumber;
        this.vTitle = vTitle;
        this.vReleaseDate = vReleaseDate;
        this.vViews = vViews;
        this.manga = manga;
    } 
}
export default volume;