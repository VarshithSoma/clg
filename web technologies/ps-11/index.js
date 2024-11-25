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
app.get("/", (req, res) => {
  res.send("welcome session exaple");
});
app.get("/login", (req, res) => {
  req.session.user = { username: "varshith" };
  res.send("user logged in");
});
app.get("/profile", (req, res) => {
  if (req.session.user) {
    res.send(`user  logged in ${req.session.user.username}`);
  } else {
    return res.send("user not logged in");
  }
});
app.get("/logout", (req, res) => {
  req.session.destroy((err) => {
    if (err) {
      return res.send("user not logged in");
    }
    res.send("user  logged out success");
  });
});
app.listen(8056, () => {
  console.log("eke");
});
