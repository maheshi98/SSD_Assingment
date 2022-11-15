import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from 'src/app/service/authentication.service';
import { ActivatedRoute, Router } from '@angular/router';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { first } from 'rxjs/operators';
import { NbToastrService } from '@nebular/theme';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  id: number = null;
  formGroup: FormGroup;
  public errorMsg;
  loading = false;
  submitted = false;
  returnUrl: string;

  constructor(
    private router: Router,
    private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private authenticationService: AuthenticationService,
    private toastrService: NbToastrService,
  ) {
    if (this.authenticationService.currentUserValue) {
      // this.router.navigate(['/dashboard']);
  }
  }

  ngOnInit(): void {
    this.initForm();
    // this.loginProcess();
  }

  initForm() {
    this.formGroup = this.formBuilder.group({
      username: new FormControl('', Validators.required),
      password: new FormControl('', Validators.required),
    });
  }

  // convenience getter for easy access to form fields
  get f() { return this.formGroup.controls; }



  /*loginProcess(){
    console.log(this.formGroup)
    this.submitted = true;
    if(this.formGroup.valid){
    console.log(this.formGroup.value)
      this.authenticationService.login(this.formGroup.value).subscribe(result => {
      this.alerts.setMessage('Login succesfull!','success');
       this.router.navigate(['/landing-page'],);
      })

    }else{
      this.alerts.setMessage('Username or password is invalid.','error');
      return;
    }


  }*/

  onSubmit() {
    this.submitted = true;
    this.loading = true;
    this.authenticationService.login(this.formGroup.value)

      .toPromise().then(data => {
        this.toastrService.success(status || '', `Login succesfull!`);
        this.router.navigateByUrl('/dashboard');

      }).then(data => { this.authenticationService.refreshToken().subscribe() }).catch(error => {
        this.toastrService.danger(status || '', `Username or password is invalid!`);
        this.loading = false;
      });

  }


  // public getAccessToken(authRequest) {
  //   console.log("in get access token")
  // let response = this.authenticationService.login(authRequest).
  //   subscribe(data => console.log("Token :" + data));
  // }

}
