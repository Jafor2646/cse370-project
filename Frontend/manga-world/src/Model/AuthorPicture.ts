import Author from "./Author";

class AuthorPicture {
    apid: number;
    appicture: string;
    author: Author;

    constructor(apid: number, appicture: string, author: Author) {
        this.apid = apid;
        this.appicture = appicture;
        this.author = author;
    }
}

export default AuthorPicture;