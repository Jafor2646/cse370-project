import Author from "./Author";
import User from "./user";

class follow {
  userId: number;
  aId: number;
  user: User;
  author: Author;

  constructor(userId: number, aId: number, user: User, author: Author) {
    this.userId = userId;
    this.aId = aId;
    this.user = user;
    this.author = author;
  }
}

export default follow;