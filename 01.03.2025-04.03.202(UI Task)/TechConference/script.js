// Page Load Transition
document.addEventListener("DOMContentLoaded", () => {
    document.body.classList.add("fade-in");
});

// Prevent Scrolling
window.addEventListener("scroll", function () {
    window.scrollTo(0, 0);
});

// Smooth Page Transitions on Navigation Click
document.querySelectorAll("nav ul li a").forEach(link => {
    link.addEventListener("click", event => {
        event.preventDefault();
        let target = event.target.href;
        
        document.body.style.animation = "fadeOut 0.5s ease-out forwards";
        
        setTimeout(() => {
            window.location.href = target;
        }, 500); // Delay before navigating
    });
});

// Countdown Timer
function startCountdown() {
    const eventDate = new Date("march 24, 2025 00:00:00").getTime();

    setInterval(function () {
        let now = new Date().getTime();
        let timeLeft = eventDate - now;

        let days = Math.floor(timeLeft / (1000 * 60 * 60 * 24));
        let hours = Math.floor((timeLeft % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        let minutes = Math.floor((timeLeft % (1000 * 60 * 60)) / (1000 * 60));
        let seconds = Math.floor((timeLeft % (1000 * 60)) / 1000);

        document.getElementById("countdown").innerHTML = 
            `${days} Days ${hours} Hours ${minutes} Minutes ${seconds} Seconds`;
    }, 1000);
}

// Form Validation
document.addEventListener("DOMContentLoaded", function () {
    startCountdown();

    const form = document.getElementById("contact-form");
    if (form) {
        form.addEventListener("submit", function (event) {
            event.preventDefault();

            let name = document.getElementById("name").value.trim();
            let email = document.getElementById("email").value.trim();
            let message = document.getElementById("message").value.trim();

            if (name === "" || email === "" || message === "") {
                alert("All fields are required!");
                return;
            }

            alert("Message sent successfully!");
            form.reset();
        });
    }
});
document.addEventListener("DOMContentLoaded", function () {
    const speakerContainer = document.getElementById("speaker-container");

    if (!speakerContainer) return;

    fetch("speakers.json")
        .then(response => response.json())
        .then(data => {
            speakerContainer.innerHTML = "";
            data.forEach(speaker => {
                let speakerDiv = document.createElement("div");
                speakerDiv.classList.add("speaker");
                speakerDiv.innerHTML = `
                    <img src="${speaker.image}" alt="${speaker.name}">
                    <h2>${speaker.name}</h2>
                    <p>${speaker.title} | ${speaker.topic}</p>
                `;
                speakerContainer.appendChild(speakerDiv);
            });
        })
        .catch(error => console.error("Error loading speakers:", error));
});

document.addEventListener("DOMContentLoaded", function () {
    const scheduleList = document.getElementById("schedule-list");
    const trackFilter = document.getElementById("track-filter");

    if (!scheduleList || !trackFilter) return;

    function loadSchedule(filter = "all") {
        fetch("schedule.json")
            .then(response => response.json())
            .then(data => {
                scheduleList.innerHTML = "";
                data.forEach(item => {
                    if (filter === "all" || item.track === filter) {
                        let sessionDiv = document.createElement("div");
                        sessionDiv.classList.add("session");
                        sessionDiv.innerHTML = `<p><strong>${item.time}</strong> - ${item.session} (${item.track})</p>`;
                        scheduleList.appendChild(sessionDiv);
                    }
                });
            })
            .catch(error => console.error("Error loading schedule:", error));
    }

    trackFilter.addEventListener("change", () => loadSchedule(trackFilter.value));
    loadSchedule();
});
document.getElementById('eventForm').addEventListener('submit', function(event) {
    event.preventDefault();
    alert('Thank you for registering for InnovateX 2025!');
    this.reset();
});

