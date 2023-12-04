import User from "./user";

class searchHistory {
    shId: number;
    shDate: Date;
    shSearch: string;
    userId: number;
    user: User;

    constructor(shId: number, shDate: Date, shSearch: string, userId: number, user: User) {
        this.shId = shId;
        this.shDate = shDate;
        this.shSearch = shSearch;
        this.userId = userId;
        this.user = user;
    }
}

export default searchHistory;