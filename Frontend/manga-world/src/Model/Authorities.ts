import user from "./user";

class authorities {
    authid: number;
    type: string;
    user: user;

    constructor(authid: number, type: string, user: user) {
        this.authid = authid;
        this.type = type;
        this.user = user;
    }
}

export default authorities;