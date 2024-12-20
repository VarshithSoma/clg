const express = require("express");
const path = require("path");
const morgan = require("morgan");
const router = require("./routes/index");
const app = express();
app.use(morgan("dev"));
app.use(express.urlencoded({ extended: true }));
app.use(express.json());
app.use("/", router);
app.listen(3000, () => {
  console.log("server running at port 3000");
});
