import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdduserComponent } from './adduser/adduser.component';
import { GetalluserComponent } from './getalluser/getalluser.component';
import { GetuserComponent } from './getuser/getuser.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';

const routes: Routes = [
  {path:'addUser',component:AdduserComponent},
  {path:'getuser',component:GetuserComponent},
  {path:'getalluser',component:GetalluserComponent},
  {path:'login',component:LoginComponent},
  {path:'registration',component:RegistrationComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
