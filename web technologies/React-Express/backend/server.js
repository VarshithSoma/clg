// server.js (Express API)
const express = require("express");
const app = express();
const cors = require("cors");

app.use(cors()); // Allow cross-origin requests
app.use(express.json());

app.get("/api/data", (req, res) => {
  res.json({ message: "Hello from the server!" });
});

app.listen(3000, () => {
  console.log("Server running on port 3000");
});
