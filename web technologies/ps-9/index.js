const express = require("express");
const app = express();
app.get("/", (req, res) => {
  res.send("hello worls");
});
app.listen(8005, () => {
  console.log("code is running ");
});
