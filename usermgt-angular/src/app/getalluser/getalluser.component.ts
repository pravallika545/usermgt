import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Observable } from 'rxjs';
import { User } from '../model/user';
import { UserService } from '../service/service';

@Component({
  selector: 'getalluser',
  templateUrl: './getalluser.component.html',
  styleUrls: ['./getalluser.component.css']
})
export class GetalluserComponent  {

  users:User[];

  constructor(private service:UserService) {
    let observable:Observable<User[]>=service.getallUser();
    observable.subscribe( userArg=>{
      this.users=userArg;
    });
   }

   removeUser(userId:number){
     let observable=this.service.deleteUser(userId);
     observable.subscribe(result=>{this.removeId(userId);
     });
   }
 
   removeId(userId:number):void{
     for(let i=0;i<this.users.length;i++){
       let user=this.users[i];
       if(user.userId===userId){
         this.users.splice(i,1);
       }
     }
   }

}
