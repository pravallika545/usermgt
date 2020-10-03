import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../model/user';
import { UserService } from '../service/service';

@Component({
  selector: 'addUser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent {

  constructor(private service :UserService) { }
user:User;
addUser(form:any){
  let data=form.value;
  let userType=data.userType;
  let userName=data.userName;
  let userPhone=data.userPhone;
  let password=data.password;
  this.user=new User(-1,userType,userName,userPhone,password);
  let observable:Observable<User>=this.service.addUser(this.user);
  observable.subscribe(userArg=>{
    this.user=userArg;
  });
}


}
