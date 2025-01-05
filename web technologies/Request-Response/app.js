const express = require("express");
const app = express();
app.get("/users/:id", (req, res) => {
  const userId = req.params.id;
  res.send({ id: userId, name: "varshith" });
});
app.get("/all", (req, res) => {
  const data = [
    { id: 1, name: "varshith" },
    { id: 2, name: "vathsal" },
  ];
  res.send(data);
});
app.post("/", (req, res) => {
  const newUser = req.body;
  res.status(201).send(newUser);
});
app.listen(8000, () => {});
