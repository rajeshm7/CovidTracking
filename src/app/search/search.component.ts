import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeSearchService } from '../employee-search.service';
import { catchError } from 'rxjs/operators';
import {HttpErrorResponse} from '@angular/common/http';
//import { ErrorObservable } from 'rxjs/Observable/ErrorObservable';

import { Observable, throwError } from 'rxjs';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  employee: Employee = new Employee(0,"","","","","");
  message: any;
  emp: any;
  id: number;
  isCollapsed: boolean = true;
  constructor(private service: EmployeeSearchService) { }
  iserror: boolean = true;
  isReportError: boolean = true;

  ngOnInit(): void {
  }

  toggleCollapse(){
    this.isCollapsed = !this.isCollapsed;
  }
  handleIserror(){
    this.iserror = !this.iserror;
  }

  public searchEmployee(){
    let obs = this.service.doSearch(this.id).pipe(catchError(() =>this.handleError));
    //obs.subscribe((data) => this.employee=data);
    obs.subscribe((message) => {
              this.message = message;
              if(this.message==null){ this.iserror = false};
              this.emp = null;
            })
  }

  public reportEmployee(){
    let obs = this.service.doreport(this.employee);
    //obs.subscribe((data) => this.employee=data);
    obs.subscribe((emp) => {
        this.emp = emp;
        if(this.emp==null){ this.isReportError = false};
        
    })
  }

  private handleError(errorResponse : HttpErrorResponse){
    this.handleIserror();
    if(errorResponse.error instanceof ErrorEvent){
      console.log("Client side error: "+errorResponse.headers);
    }
    else{
      console.log("Server side error: "+errorResponse);
    }
    //return new ErrorObservable('This user details are not available in the database.');
    return throwError('some message'); 
  }
}
