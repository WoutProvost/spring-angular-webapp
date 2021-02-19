import { Component, OnInit } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { NgForm } from "@angular/forms";

@Component({
  selector: "my-app",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent implements OnInit {

  readonly ROOT_URL: string = "http://localhost:8080";
  readonly START_SEARCH: string = "";
  readonly START_FIELD: string = "";
  readonly START_PAGE: number = 1;
  readonly START_SIZE: number = 20;
  readonly MIN_SIZE: number = 1;
  readonly START_SCORE: number = 5;
  readonly MIN_SCORE: number = 1;
  readonly MAX_SCORE: number = 5;
  search: string;
  field: string;

  horecas: any;
  currentPage: number;
  totalPages: number;
  isFirstPage: boolean;
  isLastPage: boolean;
  pageSize: number;
  totalElements: number;

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.search = this.START_SEARCH;
    this.field = this.START_FIELD;
    this.currentPage = this.START_PAGE;
    this.pageSize = this.START_SIZE;
    this.list();
  }

  list() {
    this.http.get(this.ROOT_URL + "/list?" + "search=" + this.search + "&field=" + this.field + "&page=" + this.currentPage + "&size=" + this.pageSize).subscribe(data => {
      this.horecas = data["content"];
      this.currentPage = data["number"] + 1;
      this.totalPages = data["totalPages"];
      this.isFirstPage = data["first"];
      this.isLastPage = data["last"];
      this.pageSize = data["size"];
      this.totalElements = data["totalElements"];

      if(this.totalElements === 0) {
        this.currentPage = 0;
      }
    });
  }

  previousPage() {
    --this.currentPage;
    this.list();
  }

  nextPage() {
    ++this.currentPage;
    this.list();
  }

  changeSize(size: number) {
    this.currentPage = this.START_PAGE;
    this.pageSize = size;
    this.list();
  }

  filter(form: NgForm) {    
    this.currentPage = this.START_PAGE;
    this.search = form.value["search"];
    this.field = form.value["field"];
    this.list();
  }

  addScore(id: string, score: number) {
    var scoreObj = {
      "id": id,
      "score": score
    };

    this.http.post(this.ROOT_URL + "/score", scoreObj).subscribe();
  }
  
}
