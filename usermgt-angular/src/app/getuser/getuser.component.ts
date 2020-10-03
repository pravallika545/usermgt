import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Observable } from 'rxjs';
import { User } from '../model/user';
import { UserService } from '../service/service';

@Component({
  selector: 'getuser',
  templateUrl: './getuser.component.html',
  styleUrls: ['./getuser.component.css']
})
export class GetuserComponent implements OnInit {

  constructor(private route:ActivatedRoute,private service:UserService) {
    let observable=route.paramMap;
    observable.subscribe((params:ParamMap)=>{
      let codeVal:string=params.get("userId");
      let idnum:number=Number(codeVal);
      console.log("id is "+idnum);
      this.getUserById(idnum);
      
    })
      }
    
      user:User;
    
    getUserById(userId:number){
      let observable:Observable<User>=this.service.getUser(userId);
      observable.subscribe( userArg=>{this.user=userArg});
    }
    
    findUser(form:any){
      let data=form.value;
      let userId=data.userId;
      this.getUserById(userId);
    }
      ngOnInit(): void {
      }
    
    }
