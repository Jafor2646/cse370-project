import author from "./Author";

class authorPicture {
    apid: number;
    appicture: string;
    author: author;

    constructor(apid: number, appicture: string, author: author) {
        this.apid = apid;
        this.appicture = appicture;
        this.author = author;
    }
}

export default authorPicture;