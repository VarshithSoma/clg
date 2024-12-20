const express = require("express");
const app = express();

app.set("view engine", "ejs");
app.set("views", "./views");

app.get("/", (req, res) => {
  const data = {
    title: "varshith",
    message: "Hello World",
  };
  res.render("index", data); // Use res.render to render the EJS file
});

app.listen(3000, () => {
  console.log("Server running at port: 3000");
});
