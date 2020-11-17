export class Employee{
    aadharId : number;
    name : String;
    location : String;
    empId : String;
    temprature : String;
    isHavingSymptoms : String;
    constructor(aadharId:number, name:String, location : String, empId : String, temprature : String, isHavingSymptoms : String){
        this.aadharId = aadharId;
        this.name = name;
        this.location = location;
        this.empId = empId;
        this.temprature = temprature;
        this.isHavingSymptoms = isHavingSymptoms;
    }
}