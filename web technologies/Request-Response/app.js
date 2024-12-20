const express = require("express");
const app = express();
app.get("/", (req, res) => {
  res.send("hello world");
});
app.get("/user/:id", (req, res) => {
  const userId = req.params.id;
  const user = { id: userId, name: "varshith" };
  res.send(user);
});
app.get("/all", (req, res) => {
  const users = [
    { id: 1, name: "varshith" },
    { id: 2, name: "varshith" },
  ];
  res.send(users);
});
app.post("/user", (req, res) => {
  const nuser = req.body;
  req.status(201).json(nuser);
});
app.listen(3000, () => {
  console.log("server running at port 3000");
});
