const express = require("express");
const session = require("express-session");
const app = express();
app.use(
  session({
    secret: "your-secret-code",
    resave: false,
    saveUninitialized: false,
    cookie: {
      maxAge: 6000,
    },
  })
);
