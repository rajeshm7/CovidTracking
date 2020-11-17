import { Injectable } from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeSearchService {
  

  constructor(private httpClient : HttpClient) { }

  public doSearch(id: number){
    return this.httpClient.get("http://localhost:8080/api/covidDetails/"+id );
  }

  public doreport(employee) {
    return this.httpClient.post("http://localhost:8080/api/reportUser", employee);
  }

}
