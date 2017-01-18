

http://localhost:8080/beer


Design Document: "beer", View Name: "all"

function (doc, meta) {
  if(doc.type == "beer") {
    emit(doc.name, null);
  }
}