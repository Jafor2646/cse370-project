import User from "./User";

class Authorities {
    authid: number;
    type: string;
    user: User;

    constructor(authid: number, type: string, user: User) {
        this.authid = authid;
        this.type = type;
        this.user = user;
    }
}

export default Authorities;