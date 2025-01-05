const express = require("express");
const morgan = require("morgan");
const app = express();
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
const router = require("./routes/index");
app.use("/", router);
app.listen(8000, () => {});
