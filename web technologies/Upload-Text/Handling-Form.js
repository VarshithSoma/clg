const express = require("express");
const app = express();
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.get("/", (req, res) => {
  res.send(`
  <form method="POST" action="submit">
  <input type="text" name="data"/>
  <button>submt</button>
  </form>
  `);
});
app.post("/submit", (req, res) => {
  res.send("you send " + req.body.data);
});
app.listen(3000, () => {});
