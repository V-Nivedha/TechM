let day="thursday"
switch(day){
    case "monday":
        console.log("Start of the week")
        break;
    case "tuesday":
        case "wednesday":
            case "thursday":
                console.log("Mid of the week")
                break;
    case "friday":
        console.log("Last working day of the week")
        break;
    case "saturday":
        console.log("Weekend-saturday")
        break;
    case "sunday":
        console.log("weekend-sunday")
        break;
    default:
        console.log("invalid day")
        break;

}