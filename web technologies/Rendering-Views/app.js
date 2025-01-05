const express = require("express");
const app = express();
const port = 8000;
app.set("view engine", "ejs");
app.set("views", "./views");
app.get("/", (req, res) => {
  const data = {
    title: "varshith",
    messgae: "hello world",
  };
  res.render("index", data);
});
app.listen(port, () => {
  console.log("running");
});
