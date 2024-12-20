const express = require("express");
const app = express();
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.get("/", (req, res) => {
  res.send(`
    <form action='/submit' method='post'>
    <input name="data">
    <button>send</button>
    </form>
    `);
});
app.post("/submit", (req, res) => {
  console.log(req.body.data);
  res.send(req.body.data);
});
app.listen(3000, () => {});
