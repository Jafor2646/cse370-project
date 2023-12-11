import axios from "axios";

const USER_API_BASE_URL = "http://localhost:8080/";

class WishlistController {

    currentStatusChecker(wishlist: any){
        return axios.post(USER_API_BASE_URL + "currentStatusChecker", wishlist);
    }

    addToWishList(wishlist: any){
        return axios.post(USER_API_BASE_URL + "addToWishList", wishlist);
    }

    addToOngoing(wishlist: any){
        return axios.post(USER_API_BASE_URL + "addToOngoing", wishlist);
    }

    addToAlreadyRead(wishlist: any){
        return axios.post(USER_API_BASE_URL + "addToAlreadyRead", wishlist);
    }

    removeAllInterest(wishlist: any){
        return axios.post(USER_API_BASE_URL + "removeAllInterest", wishlist);
    }

}

export default new WishlistController();