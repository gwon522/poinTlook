import { useEffect, useState } from "react";
import axios from "axios";

function App() {
  const [ip, setIp] = useState("");

  useEffect(() => {
    const action = () => {
      axios.get("/api/ip").then((result) => setIp(result.data));
    };
    action();
  }, []);

  return (
    <div className="App">
      <header className="App-header"> 메인 페이지 {ip}</header>
    </div>
  );
}

export default App;
