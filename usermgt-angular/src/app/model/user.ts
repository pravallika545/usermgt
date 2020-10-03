export class User{
    userId:number;
    userType:string;
    userName:string;
    userPhone:number;
    password:string;
    constructor(userId:number,userType:string,userName:string,userPhone:number,password:string){
        this.userId=userId;
        this.userType=userType;
        this.userName=userName;
        this.userPhone=userPhone;
        this.password=password;
    }
}