import Author from "./Author";
import User from "./User";

class Follow {
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

export default Follow;