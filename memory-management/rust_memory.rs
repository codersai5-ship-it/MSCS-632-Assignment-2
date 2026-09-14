fn print_length(text: &String) {
    println!("Length: {}", text.len());
}

fn main() {
    let message = String::from("Hello Rust");

    print_length(&message);

    let moved_message = message;

    println!("Moved value: {}", moved_message);
}
